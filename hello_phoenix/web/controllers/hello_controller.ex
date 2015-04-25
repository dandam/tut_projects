defmodule HelloPhoenix.HelloController do
  use HelloPhoenix.Web, controller

  plug :action

  def index(conn, params) do
    render conn, "index.html"
  end

end
