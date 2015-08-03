Pod::Spec.new do |s|
   s.name         = "FirerageKit"
   s.version      = "0.0.1"
   s.summary      = "FirerageKit is an Objective-C library for iOS developers."
   s.homepage     = "https://github.com/illidan-firerage/FirerageKit"
   s.license      = 'MIT'
   s.author       = { "illidan" => "illidan.firerage@qq.com" }
   s.source       = { :git => "https://github.com/illidan-firerage/FirerageKit.git", :commit => '36fa4c03b7656c829ebb42ae30335b5ae1e1fb66' }
   s.platform     = :ios, '5.1.1'

   s.source_files = 'FirerageKit/FirerageKit/FRCategories/FRViewCategory/*.{h,m}',
                    'FirerageKit/FirerageKit/FRBanner/*.{h,m}'

   s.frameworks = 'Foundation', 'CoreGraphics', 'UIKit', 'QuartzCore'
   
   s.requires_arc = true
 end