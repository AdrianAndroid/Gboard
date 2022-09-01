package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: hcd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hcd implements hiu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hcd(hci hciVar, int i, hdg hdgVar, int i2) {
        this.d = i2;
        this.b = hciVar;
        this.a = i;
        this.c = hdgVar;
    }

    public /* synthetic */ hcd(hxi hxiVar, int i, ice iceVar, int i2) {
        this.d = i2;
        this.b = hxiVar;
        this.a = i;
        this.c = iceVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, hdg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, hdg] */
    @Override // defpackage.hiu
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            Object obj2 = this.b;
            int i2 = this.a;
            ?? r5 = this.c;
            ((ltd) ((ltd) ((ltd) hci.a.d()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "lambda$requestAndUpdatePageableItems$11", 896, "EmojiPickerController.java")).u("Emoji picker pageable data loading page %d was canceled.", i2);
            hci hciVar = (hci) obj2;
            hciVar.b().A(hciVar.j(r5));
            hciVar.t.set(false);
        } else if (i == 1) {
            Object obj3 = this.b;
            int i3 = this.a;
            ?? r52 = this.c;
            ((ltd) ((ltd) ((ltd) hci.a.d()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "lambda$requestAndUpdatePageableItems$10", 887, "EmojiPickerController.java")).u("Emoji picker pageable data loading page %d failed.", i3);
            hci hciVar2 = (hci) obj3;
            hciVar2.b().A(hciVar2.j(r52));
            hciVar2.t.set(false);
        } else {
            Object obj4 = this.b;
            int i4 = this.a;
            Object obj5 = this.c;
            View view = (View) obj;
            hxi hxiVar = (hxi) obj4;
            hxiVar.t(view, 4, view.getId(), i4);
            hxiVar.s((ice) obj5, view);
        }
    }
}
