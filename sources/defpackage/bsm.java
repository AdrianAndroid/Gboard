package defpackage;

/* compiled from: PG */
/* renamed from: bsl  reason: default package */
/* loaded from: classes.dex */
final class bsl extends jcb {
    final /* synthetic */ bsn a;

    public bsl(bsn bsnVar) {
        this.a = bsnVar;
    }

    @Override // defpackage.jcb
    public final void a(boolean z) {
        bsn bsnVar = this.a;
        if (z) {
            bsnVar.d(bsnVar.b | 16);
        } else {
            bsnVar.d(bsnVar.b & (-17));
        }
    }
}  public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        bsn bsnVar = this.a;
        if (editorInfo2 != null) {
            editorInfo = editorInfo2;
        }
        bsnVar.c = editorInfo;
        bsnVar.d = z;
        bsnVar.c();
    }
}
