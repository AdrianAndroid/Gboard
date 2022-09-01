package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* renamed from: wd  reason: default package */
/* loaded from: classes2.dex */
public final class wd {
    public static wd a;

    public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
        return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
    }
}
