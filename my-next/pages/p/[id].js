import Router from "next/router";

export default function Post() {
  return (
    <ul>
      <li>{Router.query.id}</li>
      <li>This is the blog post content.</li>
    </ul>
  );
}
