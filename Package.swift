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
            checksum:"3f55afab597f48f2096bf07a516481c35fe762de87ea79d76321892638043a2f")
    ]
)


