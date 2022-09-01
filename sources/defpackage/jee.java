package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: jee  reason: default package */
/* loaded from: classes.dex */
public final class jee {
    public final int a;
    public volatile llw b = lrq.b;
    public volatile llw c = lrq.b;
    private final Resources d;
    private volatile boolean e;

    public jee(Resources resources, int i) {
        this.d = resources;
        this.a = i;
    }

    public final void a() {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    TypedArray obtainTypedArray = this.d.obtainTypedArray(this.a);
                    int length = obtainTypedArray.length();
                    lls i = llw.i(length);
                    lls h = llw.h();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = obtainTypedArray.getString(i2);
                        if (!TextUtils.isEmpty(string)) {
                            if (string.startsWith("REGEX|")) {
                                h.a(Integer.valueOf(i2), Pattern.compile(string.substring(6)));
                            } else {
                                i.a(string, Integer.valueOf(i2));
                            }
                        }
                    }
                    this.b = i.l();
                    this.c = h.l();
                    obtainTypedArray.recycle();
                    this.e = true;
                }
            }
        }
    }

    public final boolean b(String str) {
        a();
        if (this.b.containsKey(str)) {
            return true;
        }
        lsz it = this.c.values().iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
