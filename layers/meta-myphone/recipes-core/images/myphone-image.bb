SUMMARY = "Production Mobile OS Image for Raspberry Pi 4"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " \
    weston \
    weston-init \
    wayland \
    libinput \
    qtbase \
    qtdeclarative \
    qtwayland \
    wpa-supplicant \
    networkmanager \
    networkmanager-nmcli \
    bluez5 \
    alsa-utils \
    openssh \
"

IMAGE_ROOTFS_SIZE = "2097152"
