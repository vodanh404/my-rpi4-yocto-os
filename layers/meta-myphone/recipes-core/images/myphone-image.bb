SUMMARY = "MyPhone Yocto Linux Image for Raspberry Pi 4"
DESCRIPTION = "Custom embedded image featuring Wayland/Weston and Qt6 framework."
LICENSE = "MIT"

inherit core-image

# Core system packages and hardware tools
IMAGE_INSTALL += " \
    packagegroup-core-boot \
    kernel-modules \
    networkmanager \
    bluez5 \
    i2c-tools \
    alsa-utils \
"

# Wayland / Weston graphic stack
IMAGE_INSTALL += " \
    weston \
    weston-init \
    wayland-utils \
"

# Qt6 runtime packages
IMAGE_INSTALL += " \
    qtbase \
    qtdeclarative \
    qtwayland \
"

# Set image features
IMAGE_FEATURES += " \
    ssh-server-openssh \
    package-management \
"

# Define target image size expansions if needed
IMAGE_ROOTFS_SIZE ?= "4194304"
IMAGE_OVERHEAD_FACTOR ?= "1.3"
