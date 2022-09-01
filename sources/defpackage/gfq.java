package defpackage;

import android.content.ContentResolver;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gfq  reason: default package */
/* loaded from: classes.dex */
public final class gfq extends gfs {
    public gfq(String str, Boolean bool) {
        super(str, bool);
    }

    @Override // defpackage.gfs
    public final /* synthetic */ Object a() {
        boolean z;
        ContentResolver contentResolver = gfs.a;
        String str = this.b;
        boolean booleanValue = ((Boolean) this.c).booleanValue();
        Object b = gfp.b(contentResolver);
        Boolean bool = (Boolean) gfp.a(gfp.g, str, Boolean.valueOf(booleanValue));
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            String d = gfp.d(contentResolver, str);
            if (d != null && !d.equals("")) {
                if (gfp.c.matcher(d).matches()) {
                    booleanValue = true;
                    bool = true;
                } else if (gfp.d.matcher(d).matches()) {
                    booleanValue = false;
                    bool = false;
                } else {
                    Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + d + "\") as boolean");
                }
            }
            gfp.c(b, gfp.g, str, bool);
            z = booleanValue;
        }
        return Boolean.valueOf(z);
    }
}
