import React from "react";
import { TodoContext } from "../TodoContext";
import "./TodoCounter.css";

function TodoCounter() {
  const { totalTodos, completedTodos } = React.useContext(TodoContext);

  return (
    <h1 className="TodoCounter">
      HAS COMPLETADO {completedTodos} DE {totalTodos} TODOS
    </h1>
  );
}

export { TodoCounter };
