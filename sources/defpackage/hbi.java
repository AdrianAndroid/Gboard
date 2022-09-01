package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: hbi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hbi implements lfe {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hbi(hbj hbjVar, String str, int i) {
        this.c = i;
        this.b = hbjVar;
        this.a = str;
    }

    public /* synthetic */ hbi(String str, String str2, int i) {
        this.c = i;
        this.b = str;
        this.a = str2;
    }

    @Override // defpackage.lfe
    public final boolean a(Object obj) {
        joa joaVar;
        joa joaVar2;
        if (this.c == 0) {
            return ((hbj) this.b).b.a((String) obj).contains(this.a);
        }
        Object obj2 = this.b;
        String str = this.a;
        joe joeVar = (joe) obj;
        Pattern pattern = gbx.a;
        if (joeVar.a == 13) {
            joaVar = (joa) joeVar.b;
        } else {
            joaVar = joa.f;
        }
        if (!joaVar.a.equals(obj2)) {
            return false;
        }
        if (joeVar.a == 13) {
            joaVar2 = (joa) joeVar.b;
        } else {
            joaVar2 = joa.f;
        }
        return joaVar2.e.equals(str);
    }
}
