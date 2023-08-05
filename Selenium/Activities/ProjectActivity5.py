from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity5():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    driver.find_element(By.XPATH,".//a[contains(text(),'My Account')]").click()
    pageTitle = driver.title
    assert  pageTitle == "My Account – Alchemy LMS"

    print("Validated the page title successfully")

projectActivity5()