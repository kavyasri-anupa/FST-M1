from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity2():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    heading = driver.find_element(By.CLASS_NAME,"uagb-ifb-title").text
    assert heading== "Learn from Industry Experts"
    print("Validated the page heading successfully")

projectActivity2()
