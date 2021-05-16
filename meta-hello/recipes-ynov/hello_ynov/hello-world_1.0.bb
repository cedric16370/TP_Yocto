DESCRIPTION = "Hello Ynov programme"
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://$~/Yocto/poky/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 


SRC_URI = "file://hello.c"
S = "${WORKDIR}"

do_compile() {
	# Cadeaux, je vous donne la commande pour compiler
	${CC} hello.c ${LDFLAGS} -o hello
}


do_install() {
	install -d ${D}${bindir}
        install -m 0755 hello ${D}${bindir}
}
