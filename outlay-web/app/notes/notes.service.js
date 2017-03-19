// import {Http} from '@angular/http'
System.register([], function(exports_1, context_1) {
    "use strict";
    var __moduleName = context_1 && context_1.id;
    var NotesService;
    return {
        setters:[],
        execute: function() {
            NotesService = (function () {
                function NotesService() {
                }
                NotesService.prototype.retrieveNotes = function () {
                    return ["Notes1", "Notes3"];
                };
                return NotesService;
            }());
            exports_1("NotesService", NotesService);
        }
    }
});
//# sourceMappingURL=notes.service.js.map