package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;

/* compiled from: PG */
/* renamed from: jfu  reason: default package */
/* loaded from: classes.dex */
public final class jfu extends jfd {
    private final jav a;

    public jfu(jav javVar) {
        this.a = javVar;
    }

    @Override // defpackage.jfd
    protected final String a() {
        return this.a.n;
    }

    @Override // defpackage.jfn
    public final String c() {
        return "language";
    }

    @Override // defpackage.jfn
    public final boolean d(AttributeSet attributeSet, int i) {
        String attributeValue = attributeSet.getAttributeValue(i);
        if (attributeValue == null) {
            return true;
        }
        if (attributeValue.isEmpty()) {
            throw new lgj("No languages specified.");
        }
        for (String str : lfy.c('|').h().i(attributeValue)) {
            if (!TextUtils.isEmpty(str) && this.a.r(str)) {
                return true;
            }
        }
        return false;
    }
}
