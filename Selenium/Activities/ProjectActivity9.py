from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity9():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    driver.find_element(By.XPATH,".//a[contains(text(),'My Account')]").click()
    driver.find_element(By.XPATH, ".//a[contains(text(),'Login')]").click()
    driver.find_element(By.ID, "user_login").send_keys("root")
    driver.find_element(By.ID, "user_pass").send_keys("pa$$w0rd")
    driver.find_element(By.ID, "wp-submit").click()
    driver.find_element(By.XPATH, ".//a[contains(text(),'All Courses')]").click()
    driver.find_element(By.XPATH, ".//article[@id='post-24042']/a[1]/img[1]").click()
    driver.find_element(By.XPATH, ".//div[contains(@class,'is_sample ')]/div[1]/a[1]/div[2]").click()
    title = driver.title
    assert title == "Effective Writing & Promoting Your Content – Alchemy LMS"
    print("validated the title successfully")


projectActivity9()
