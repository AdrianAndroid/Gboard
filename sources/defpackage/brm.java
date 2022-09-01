package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayDeque;

/* compiled from: PG */
/* renamed from: brm  reason: default package */
/* loaded from: classes.dex */
abstract class brm extends inz {
    private final Context a;
    private final StringBuilder b = new StringBuilder();
    private final ArrayDeque c = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: protected */
    public brm(Context context, imt imtVar) {
        super(PreferenceGroup.class, imtVar);
        this.a = context;
    }

    @Override // defpackage.inz
    protected /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.inz
    public void b() {
        this.b.setLength(((Integer) this.c.getFirst()).intValue());
        this.c.pop();
    }

    @Override // defpackage.inz
    protected final int f(String str) {
        return jbi.c(this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g(Preference preference) {
        int length = this.b.length();
        this.b.append(preference.t);
        StringBuilder sb = this.b;
        String sb2 = sb.toString();
        sb.setLength(length);
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(Preference preference) {
        this.c.push(Integer.valueOf(this.b.length()));
        if (preference != null) {
            StringBuilder sb = this.b;
            sb.append(preference.t);
            sb.append(">");
        }
    }
}
