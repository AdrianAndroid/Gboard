package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: let  reason: default package */
/* loaded from: classes.dex */
public final class let extends lem implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public let(Pattern pattern) {
        jdg.u(pattern);
        this.a = pattern;
    }

    @Override // defpackage.lem
    public final kcl a(CharSequence charSequence) {
        return new kcl(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
