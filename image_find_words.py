import os
import PIL
import Image
import shutil

from pytesseract import *

images_path = ''
save_location = ''

def checkImage(files):
    if files.lower().find('stolen') != -1 or files.lower().find('lost') != -1:
        files = os.path.basename(files)
        print "Placing file in lost cards -" + files
        shutil.copy(os.path.join(path, files), save_location + "/lost cards/" + os.path.splitext(files)[1].replace('.','') + "/" + files)
        return True
    elif files.lower().find('household') != -1 or files.lower().find('merge') != -1:
        files = os.path.basename(files)
        print "Placing file in household -" + files
        shutil.copy(os.path.join(path, files), save_location + "/household/" + os.path.splitext(files)[1].replace('.','') + "/" + files)
        return True
    else:
        print "Processing Image-" + os.path.basename(files)
        image_tesseract = Image.open(files) #Open image object using PIL
        search_image_text = image_to_string(image_tesseract) #Run tesseract.exe on image
           
        if search_image_text.find('stolen') != -1 or search_image_text.find('lost') != -1 or search_image_text.find('defaced') != -1 or search_image_text.find('New') != -1 or search_image_text.find('Old') != -1: #If key word is in file
            files = os.path.basename(files)
            print "Placing file in lost cards -" + files
            shutil.copy(os.path.join(path, files), save_location + "/lost cards/" + os.path.splitext(files)[1].replace('.','') + "/" + files)
            return True
        elif search_image_text.find('household') != -1 or search_image_text.find('Primary') != -1: #If key word is in file
            files = os.path.basename(files)
            print "Placing file in household -" + files
            shutil.copy(os.path.join(path, files), save_location + "/household/" + os.path.splitext(files)[1].replace('.','') + "/" + files)
            return True
        else:
            return False

def rotate(files):
    print os.path.basename(files) + " Rotating Image"
    os.chdir(path)
    os.system('convert "' + os.path.basename(files) + '" -rotate -90 "' + os.path.basename(files) + '"')
    return

if __name__ == '__main__':
    for path, subdirs, files in os.walk(images_path):
        filenames = filter(lambda x: any([x.endswith(ext) for ext in ['.pdf','.png', '.jpg', '.gif', '.tif', '.tiff']]), files)

        for files in filenames:
            join = os.path.join(path, files)
            find_image = checkImage(join)
            while find_image != True:
                i = 0
                for i in range(3):
                    if find_image != True:               
                        rotate(join)
                        find_image = checkImage(join)

                    if find_image == True:
                        break
                    
                    if i == 2:            
                        print "Placing file in unsure -" + files
                        shutil.copy(os.path.join(path, files), save_location + "/Unsure/" + os.path.splitext(files)[1].replace('.','') + "/" + files)                
                        break 
                break
