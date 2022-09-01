package defpackage;

/* compiled from: PG */
/* renamed from: ceo  reason: default package */
/* loaded from: classes.dex */
public final class ceo extends ceu {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ceu
    public final void a(jub jubVar, String str, String str2, StringBuilder sb) {
        super.a(jubVar, str, str2, sb);
        if ("appName".equals(str)) {
            jubVar.e("appName", str2);
            sb.append("_");
            sb.append(str2.replace(".", "_").replace(",", "_").replace("*", "_"));
        }
    }
}
