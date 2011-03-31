/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.facebook;

import java.util.List;

import org.springframework.social.facebook.types.Comment;
import org.springframework.social.facebook.types.Reference;

/**
 * Defines operations for reading and posting comments to Facebook.
 * @author Craig Walls
 */
public interface CommentApi {
	
	/**
	 * Retrieves all comments for a given object.
	 * @param objectId the objectId
	 * @return a list of {@link Comment}s for the specified object
	 */
	List<Comment> getComments(String objectId);
	
	/**
	 * Retrieves a single comment
	 * @param commentId the comment ID
	 * @return the requested {@link Comment}
	 */
	Comment getComment(String commentId);
	
	/**
	 * Posts a comment on an object on behalf of the authenticated user.
	 * @param objectId the object ID
	 * @param message the comment message
	 * @return the new comment's ID
	 */
	String addComment(String objectId, String message);

	/**
	 * Delete a comment
	 * @param commentId the comment ID
	 */
	void deleteComment(String commentId);

	/**
	 * Retrieve a list of references to users who have liked a given object.
	 * @param objectId
	 * @return a list of {@link Reference}s
	 */
	List<Reference> getLikes(String objectId);

}
