/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import java.util.List;

import com.wolaidai.ws.jrocket2.persistence.Document;
import com.wolaidai.ws.jrocket2.persistence.Liaison;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface DocumentMapper
{
	List<Document> getDocumentsByUser(Integer id);
	Document getDocumentById(Integer id);
    void insertDocument(Document document);
    void updateDocument(Document document);
    void deleteDocument(Document document);		
}
