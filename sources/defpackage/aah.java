package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
@oka(b = "androidx.core.view.ViewGroupKt$descendants$1", c = "ViewGroup.kt", d = "invokeSuspend", e = {118, 120})
/* renamed from: aah  reason: default package */
/* loaded from: classes.dex */
public final class aah extends okd implements oku {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ ViewGroup f;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aah(ViewGroup viewGroup, ojv ojvVar) {
        super(ojvVar);
        this.f = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oku
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aah) c(obj, obj2)).b(oji.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007e -> B:5:0x0080). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0088 -> B:6:0x008c). Please submit an issue!!! */
    @Override // defpackage.ojz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ojx r0 = defpackage.ojx.COROUTINE_SUSPENDED
            int r1 = r10.e
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 == r2) goto L17
            int r1 = r10.d
            int r3 = r10.c
            java.lang.Object r4 = r10.a
            java.lang.Object r5 = r10.h
            defpackage.oix.c(r11)
            r11 = r10
            goto L80
        L17:
            int r1 = r10.d
            int r3 = r10.c
            java.lang.Object r4 = r10.b
            java.lang.Object r5 = r10.a
            java.lang.Object r6 = r10.h
            defpackage.oix.c(r11)
            r11 = r10
            goto L5d
        L26:
            defpackage.oix.c(r11)
            java.lang.Object r11 = r10.h
            android.view.ViewGroup r1 = r10.f
            int r3 = r1.getChildCount()
            r4 = 0
            r5 = r10
        L33:
            if (r4 >= r3) goto L92
            r6 = r1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r6 = r6.getChildAt(r4)
            java.lang.String r7 = "getChildAt(index)"
            defpackage.oll.d(r6, r7)
            r5.h = r11
            r5.a = r1
            r5.b = r6
            r5.c = r4
            r5.d = r3
            r5.e = r2
            r7 = r11
            omk r7 = (defpackage.omk) r7
            java.lang.Object r7 = r7.a(r6, r5)
            if (r7 == r0) goto L91
            r8 = r6
            r6 = r11
            r11 = r5
            r5 = r1
            r1 = r3
            r3 = r4
            r4 = r8
        L5d:
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L88
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            omi r4 = defpackage.tp.s(r4)
            r11.h = r6
            r11.a = r5
            r7 = 0
            r11.b = r7
            r11.c = r3
            r11.d = r1
            r7 = 2
            r11.e = r7
            r7 = r6
            omk r7 = (defpackage.omk) r7
            java.lang.Object r4 = r7.c(r4, r11)
            if (r4 == r0) goto L87
            r4 = r5
            r5 = r6
        L80:
            r8 = r5
            r5 = r11
            r11 = r8
            r9 = r4
            r4 = r1
            r1 = r9
            goto L8c
        L87:
            return r0
        L88:
            r4 = r1
            r1 = r5
            r5 = r11
            r11 = r6
        L8c:
            int r3 = r3 + r2
            r8 = r4
            r4 = r3
            r3 = r8
            goto L33
        L91:
            return r0
        L92:
            oji r11 = defpackage.oji.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aah.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ojz
    public final ojv c(Object obj, ojv ojvVar) {
        aah aahVar = new aah(this.f, ojvVar);
        aahVar.h = obj;
        return aahVar;
    }
}
