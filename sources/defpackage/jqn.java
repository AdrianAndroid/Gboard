package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: jqn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jqn implements jnf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jqn(jtr jtrVar, String str, Throwable th, int i) {
        this.d = i;
        this.c = jtrVar;
        this.a = str;
        this.b = th;
    }

    public /* synthetic */ jqn(jtr jtrVar, String str, jpz jpzVar, int i) {
        this.d = i;
        this.a = jtrVar;
        this.b = str;
        this.c = jpzVar;
    }

    public /* synthetic */ jqn(jvr jvrVar, jsr jsrVar, jxz jxzVar, int i) {
        this.d = i;
        this.a = jvrVar;
        this.c = jsrVar;
        this.b = jxzVar;
    }

    public /* synthetic */ jqn(jyc jycVar, String str, jxy jxyVar, int i) {
        this.d = i;
        this.a = jycVar;
        this.b = str;
        this.c = jxyVar;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        jtr jtrVar;
        int i = this.d;
        if (i == 0) {
            Object obj2 = this.a;
            jtr jtrVar2 = (jtr) obj2;
            ((jra) obj).l(jtrVar2, (String) this.b, (Throwable) this.c);
        } else if (i == 1) {
            Object obj3 = this.c;
            jtr jtrVar3 = (jtr) obj3;
            ((jra) obj).l(jtrVar3, (String) this.a, (Throwable) this.b);
        } else if (i == 2) {
            Object obj4 = this.a;
            Object obj5 = this.c;
            Object obj6 = this.b;
            jvo jvoVar = (jvo) obj;
            try {
                jtrVar = ((jvr) obj4).c((jsr) obj5);
            } catch (IOException e) {
                ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/gc/FileManager", "getSuperpackNameOrLog", 1086, "FileManager.java")).w("Failed to get superpack name for '%s'", obj5);
                jtrVar = null;
            }
            jsr jsrVar = (jsr) obj5;
            jvoVar.k(jsrVar, jtrVar, ((jvr) obj4).k(jsrVar), (jxz) obj6);
        } else {
            Object obj7 = this.a;
            Object obj8 = this.b;
            jyc jycVar = (jyc) obj7;
            String str = (String) obj8;
            ((jzd) obj).i(str, jycVar.a.g(), (jxy) this.c, jycVar.a.j().length());
        }
    }
}
