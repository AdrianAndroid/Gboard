package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: avr  reason: default package */
/* loaded from: classes.dex */
public final class avr extends avv {
    public avr(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.avj
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.avv
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
        }
        return openAssetFileDescriptor.getParcelFileDescriptor();
    }

    @Override // defpackage.avv
    protected final /* synthetic */ void c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
