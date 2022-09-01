package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: azj  reason: default package */
/* loaded from: classes.dex */
final class azj implements avj {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public azj(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.avj
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.avj
    public final void d() {
    }

    @Override // defpackage.avj
    public final void f(atk atkVar, avi aviVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            aviVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            aviVar.b(new File(str));
        }
    }

    @Override // defpackage.avj
    public final void fh() {
    }

    @Override // defpackage.avj
    public final int g() {
        return 1;
    }
}
