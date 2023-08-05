from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity6():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    driver.find_element(By.XPATH,".//a[contains(text(),'My Account')]").click()
    pageTitle = driver.title
    assert  pageTitle == "My Account – Alchemy LMS"

    driver.find_element(By.XPATH, "//a[contains(text(),'Login')]").click()
    driver.find_element(By.ID, "user_login").send_keys("root")
    driver.find_element(By.ID, "user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.ID, "wp-submit").click()
    user = driver.find_element(By.XPATH, ".//li[@id='wp-admin-bar-my-account']/a[1]/span[1]").text
    assert user == "root"

    print("Validated the login successfully")

projectActivity6()