package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: PG */
/* renamed from: awa  reason: default package */
/* loaded from: classes.dex */
public final class awa implements awc {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public awa(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.awc
    public final Cursor a(Uri uri) {
        return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
