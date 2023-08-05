from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity7():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    driver.find_element(By.XPATH,".//ul[contains(@class,'nav-')]/li[2]/a[1]").click()
    count = driver.find_elements(By.XPATH, ".//div[@class='ld-course-list-items row']/div")
    print("Number of courses:", len(count))


projectActivity7()
