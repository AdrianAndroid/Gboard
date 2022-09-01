package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cdi  reason: default package */
/* loaded from: classes.dex */
public final class cdi extends gyj {
    public static volatile cdi a;
    private static final String[] l = {"data1", "times_contacted", "last_time_contacted", "in_visible_group"};
    public cdh c;
    private final long m;
    private final long n;
    private final Runnable o = new cbq(this, 2);
    private final mks p = gxo.c(10);
    public final AtomicBoolean b = new AtomicBoolean();

    public cdi(Context context) {
        super(context, "EmailDataManager");
        Resources resources = context.getResources();
        this.n = resources.getInteger(R.integer.f131160_resource_name_obfuscated_res_0x7f0c001a);
        this.m = resources.getInteger(R.integer.f131130_resource_name_obfuscated_res_0x7f0c0017);
    }

    public static int d(Object[] objArr) {
        Object obj = objArr[1];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public static long e(Object[] objArr) {
        Object obj = objArr[2];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Object[] objArr) {
        return (String) objArr[0];
    }

    public static boolean m(Object[] objArr) {
        Object obj = objArr[3];
        return (obj instanceof Integer) && ((Integer) obj).intValue() != 0;
    }

    private final void z() {
        if (!this.b.getAndSet(true)) {
            if (!this.j) {
                this.b.set(false);
                if (this.c == null) {
                    return;
                }
                this.p.execute(new cfy(this.c, guw.a(), 1));
                return;
            }
            this.h.postDelayed(this.o, this.f.D("pref_key_email_count") == 0 ? this.m : this.n);
        }
    }

    @Override // defpackage.gyj
    public final int c() {
        return R.string.f161460_resource_name_obfuscated_res_0x7f1406b3;
    }

    @Override // defpackage.gyj
    protected final Uri f() {
        return ContactsContract.CommonDataKinds.Email.CONTENT_URI;
    }

    @Override // defpackage.gyj
    public final ido g() {
        return gyl.CONTENT_DATA_MANAGER_EMAILS_RUN;
    }

    @Override // defpackage.gyj
    public final ids h() {
        return gym.CONTENT_DATA_MANAGER_EMAILS_RUN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public final void j() {
        ((luc) ((luc) this.e.b()).k("com/google/android/apps/inputmethod/libs/delight5/email/EmailDataManager", "onContentChanged", 115, "EmailDataManager.java")).t("onContentChanged()");
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public final synchronized void k(int i, int i2) {
        ((luc) ((luc) this.e.b()).k("com/google/android/apps/inputmethod/libs/delight5/email/EmailDataManager", "onImportFinished", 189, "EmailDataManager.java")).y("onImportFinished() : Result = %d : Count = %d", i, i2);
        if (i == 2) {
            this.f.h("pref_key_email_count", i2);
        }
    }

    @Override // defpackage.gyj
    protected final void l(boolean z) {
        this.f.h("pref_key_email_count", 0);
        z();
    }

    @Override // defpackage.gyj
    protected final synchronized boolean n(Cursor cursor) {
        return cursor.getCount() != this.f.D("pref_key_email_count");
    }

    @Override // defpackage.gyj
    protected final String[] o() {
        return l;
    }
}
