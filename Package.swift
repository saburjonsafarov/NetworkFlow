// swift-tools-version:5.3
import PackageDescription

let package = Package(
    name: "ComposeApp",
    platforms: [
        .iOS(.v14),
    ],
    products: [
        .library(name: "ComposeApp", targets: ["ComposeApp"])
    ],
    targets: [
        .binaryTarget(
            name: "ComposeApp",
            url: "https://github.com/saburjonsafarov/NetworkFlow/releases/download/v1.0.0/ComposeApp.xcframework.zip",
            checksum:"a40efea91a2f1fe61dea6cf93fd95eabb344b192eafc9b57ad6d1553dd0e0be0")
    ]
)


