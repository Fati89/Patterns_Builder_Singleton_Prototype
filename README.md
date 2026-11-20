## BUILDER
![img.png](img.png)
### avec Json
ajouton la dependency
```
<dependencies>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.14.1</version>
        </dependency>
    </dependencies>
```
![img_1.png](img_1.png)

## SINGLOTON
### avec block statique
![img_2.png](img_2.png)
![img_3.png](img_3.png)
![img_4.png](img_4.png)
![img_9.png](img_9.png)
### sans block statique
![img_6.png](img_6.png)
![img_7.png](img_7.png)
### test avec les threads
![img_10.png](img_10.png)

## PROTOTYPE
![img_11.png](img_11.png)
#### c'est pas le meme objet sur memoire, deux adresses differentes
![img_12.png](img_12.png)
![img_13.png](img_13.png)
### le customer se change pour les deux
![img_14.png](img_14.png)
### on clone les deux
![img_15.png](img_15.png)