package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bbw  reason: default package */
/* loaded from: classes.dex */
public final class bbw implements bbx {
    private final /* synthetic */ int a;

    public bbw(int i) {
        this.a = i;
    }

    @Override // defpackage.bbx
    public final /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = this.a;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new bbv((ByteBuffer) obj));
        } else if (i == 1) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } else {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }
}
