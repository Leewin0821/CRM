/*global module:false*/
module.exports = function(grunt) {

  // Project configuration.
  grunt.initConfig({
    // Metadata.
    pkg: grunt.file.readJSON('package.json'),
	  
	  karma: {
		  unit: {
			  backgroung: true,
			  singleRun: false,
			  options: {
				  basePath: '',
				  frameworks: ['jasmine'],
				  files: [
					  'src/main/javascript/karma_test.js',
      				  'src/test/javascript/karma_test_spec.js'
				  ],
				  reporters: ['progress'],
				  port: 9876,
				  colors: true,
				  browsers: [
					  'Chrome', 'PhantomJS'
				  ]
			  }
		  }
	  },
	  
	  watch: {
		  karma: {
			  files: [
				  'src/main/javascript/karma_test.js',
				  'src/test/javascript/karma_test_spec.js'
			  ],
			  tasks: ['karma:unit:run']
		  }
	  }
	  
	});
	  
	grunt.loadNpmTasks('grunt-karma');
	grunt.loadNpmTasks('grunt-contrib-watch');
	
	grunt.registerTask('ut', ['karma']);
	grunt.registerTask('default', ['ut','watch']);
};
