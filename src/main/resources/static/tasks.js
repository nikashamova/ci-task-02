angular.module('taskApp', [])
    .controller('TaskListController', function ($http) {

        function contextUrl(url) {
            return window.location.origin + '/' + url;
        }

        // init tasks
        $http({
            method: 'GET',
            url: contextUrl('tasks'),
        }).then(function (response) {
            taskList.tasks = response.data;
        });

        const taskList = this;

        taskList.addTask = function () {
            $http({
                method: 'POST',
                url: contextUrl('tasks'),
                params: {
                    title: taskList.taskTitle,
                    description: taskList.taskDescription
                }
            });
            taskList.tasks.push({title: taskList.taskTitle, description: taskList.taskDescription, ready: false});
            taskList.taskTitle = '';
            taskList.taskDescription = '';
        };

        taskList.finishTask = function (taskTitle, taskReady) {
            if (taskReady) {
                $http({
                    method: 'POST',
                    url: contextUrl('tasks/finish'),
                    params: {
                        title: taskTitle,
                    }
                });
            } else {
                console.log('the same logic but for unfinished');
            }
        }

        taskList.remaining = function () {
            let count = 0;
            angular.forEach(taskList.tasks, function (task) {
                count += task.ready ? 0 : 1;
            });
            return count;
        };

    });