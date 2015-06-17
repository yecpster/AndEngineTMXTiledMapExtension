package org.andengine.extension.tmx;

import org.andengine.entity.sprite.batch.SpriteBatch;
import org.andengine.entity.sprite.batch.vbo.LowMemorySpriteBatchVertexBufferObject;
import org.andengine.opengl.texture.ITexture;
import org.andengine.opengl.vbo.DrawType;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class LowMemorySpriteBatch extends SpriteBatch {

    public LowMemorySpriteBatch(final ITexture iTexture, final int capacity, final VertexBufferObjectManager vbom) {
        super(iTexture, capacity, new LowMemorySpriteBatchVertexBufferObject(vbom, capacity * SpriteBatch.SPRITE_SIZE, DrawType.STATIC, true,
                SpriteBatch.VERTEXBUFFEROBJECTATTRIBUTES_DEFAULT));
        this.setCullingEnabled(true);
    }

}
