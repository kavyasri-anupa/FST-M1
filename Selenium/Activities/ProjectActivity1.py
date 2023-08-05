from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity1():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    heading = driver.title
    assert heading == "Alchemy LMS – An LMS Application"

    print("Validated the page title successfully")

projectActivity1()
