Pod::Spec.new do |s|
  s.name     = 'UIButton+Bootstrap'
  s.version  = '0.0.1'
  s.license  = 'MIT'
  s.summary  = 'Simple UIButton category that adds nice and flat Bootstrap 3.0 button styles.'
  s.homepage = 'https://github.com/OskarGroth'
  s.author   = { 'appdesignvault' => 'appdesignvault' }
  s.source   = { :git => 'https://github.com/OskarGroth/UIButton-Bootstrap.git', :commit => '1fdbd6c81af8b892dd3383793837ff0e07c95d6c' }
  s.platform = :ios  
  s.source_files = 'StrapButton/NSString+FontAwesome.{h,m}','StrapButton/UIButton+Bootstrap.{h,m}'
  s.framework = 'UIKit','Foundation','CoreGraphics'

  s.requires_arc = true  
end