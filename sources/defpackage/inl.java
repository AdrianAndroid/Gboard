package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: inl  reason: default package */
/* loaded from: classes.dex */
public final class inl implements inc {
    final /* synthetic */ ino a;

    public inl(ino inoVar) {
        this.a = inoVar;
    }

    @Override // defpackage.inc
    public final void b() {
        if (!this.a.b) {
            ijf.j(ino.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.inc
    public final void c(SharedPreferences sharedPreferences) {
        ino inoVar = this.a;
        inoVar.ab(inoVar.d.a(), sharedPreferences);
    }
}
