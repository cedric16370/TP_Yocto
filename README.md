# TP_Yocto

L'objectif du TP est d'apprendre à utilisé Yocto.

La première étape est d'ajouter les différentes layers dans le BBlayers.conf

![image](https://user-images.githubusercontent.com/72381443/118412332-a5a15f80-b699-11eb-8e7d-8ce4247eae91.png)

Ensuite on configure le local.conf puis on créer une nouvelle layers qui contient nos fichiers hello.c et hello-world_.1.0.

![image](https://user-images.githubusercontent.com/72381443/118412474-7b9c6d00-b69a-11eb-9c67-fea9606c1067.png)

Pour lancer le build il faut lancer la commande "bitbake build ynov-rpi4-image.bb"

Pour finir uploader l'image sur carte micro SD vers la Raspberry Pi 3 dd if=MonImage.rootfs.rpi-sdimg of=/dev/sdb bs=4M



