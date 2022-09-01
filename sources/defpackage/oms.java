package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: PG */
/* renamed from: oms  reason: default package */
/* loaded from: classes2.dex */
public final class oms {
    public final Matcher a;
    private List b;

    public oms(Matcher matcher, CharSequence charSequence) {
        oll.e(matcher, "matcher");
        oll.e(charSequence, "input");
        this.a = matcher;
    }

    public final List a() {
        if (this.b == null) {
            this.b = new omr(this);
        }
        List list = this.b;
        oll.b(list);
        return list;
    }
}
