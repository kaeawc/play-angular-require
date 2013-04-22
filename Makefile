all:
	coffee --output ./public/js/ --compile ./public/coffee/
	stylus  -o ./public/css/ -c ./public/stylus/app.styl
