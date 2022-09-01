package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: avf  reason: default package */
/* loaded from: classes.dex */
public final class avf extends avv {
    public avf(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.avj
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.avv
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.avv
    protected final /* synthetic */ void c(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
