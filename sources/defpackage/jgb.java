package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: jgb  reason: default package */
/* loaded from: classes.dex */
public final class jgb extends jfd {
    public final String a;
    public final String b;

    public jgb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.jfd
    protected final String a() {
        return String.valueOf(this.b);
    }

    @Override // defpackage.jfn
    public final String c() {
        return this.a;
    }

    @Override // defpackage.jfn
    public final boolean d(AttributeSet attributeSet, int i) {
        if (this.b == null) {
            return false;
        }
        String attributeValue = attributeSet.getAttributeValue(i);
        if (TextUtils.isEmpty(attributeValue)) {
            throw new lgj("No string specified.");
        }
        for (String str : lfy.c('|').h().i(attributeValue)) {
            if (jdg.Z(this.b, str)) {
                return true;
            }
        }
        return false;
    }
}
