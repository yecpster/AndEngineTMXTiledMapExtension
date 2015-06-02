package org.andengine.extension.tmx;

import org.andengine.entity.sprite.batch.SpriteBatch;
import org.andengine.entity.sprite.batch.vbo.LowMemorySpriteBatchVertexBufferObject;
import org.andengine.opengl.vbo.DrawType;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class TMXLayerSuper extends SpriteBatch {

    public TMXLayerSuper(final int capacity, final VertexBufferObjectManager vbom) {
        super(null, capacity, new LowMemorySpriteBatchVertexBufferObject(vbom, capacity * SpriteBatch.SPRITE_SIZE, DrawType.STATIC, true,
                SpriteBatch.VERTEXBUFFEROBJECTATTRIBUTES_DEFAULT));
    }

}
