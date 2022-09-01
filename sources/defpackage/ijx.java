package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

/* compiled from: PG */
/* renamed from: ijx  reason: default package */
/* loaded from: classes.dex */
public abstract class ijx extends CursorWrapper {
    public ijx(Cursor cursor) {
        super(cursor);
    }

    protected abstract long a();

    public final ika b() {
        return new ika(a(), e(), d(), c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract jav c();

    public abstract String d();

    public abstract String e();
}
