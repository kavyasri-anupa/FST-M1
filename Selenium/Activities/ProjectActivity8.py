from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity8():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    driver.find_element(By.XPATH,".//a[contains(text(),'Contact')]").click()
    driver.find_element(By.XPATH, ".//div[contains(@class,'name')]/input[1]").send_keys("Test")
    driver.find_element(By.XPATH, ".//div[contains(@class,'email')]/input[1]").send_keys("Test@email.in")
    driver.find_element(By.XPATH, ".//div[contains(@class,'field-')]/textarea[1]").send_keys("This is a comment")
    driver.find_element(By.XPATH, ".//*[contains(text(),'Send Message')]").click()
    message = driver.find_element(By.XPATH, ".//div[contains(@class,'wpforms-confirmation-container ')]/p[1]").text
    print(message)


projectActivity8()
