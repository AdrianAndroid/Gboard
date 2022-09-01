package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* renamed from: xb  reason: default package */
/* loaded from: classes2.dex */
public final class xb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
    }

    public static int[] b() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }
}
