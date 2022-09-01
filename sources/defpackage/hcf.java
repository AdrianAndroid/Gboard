package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* renamed from: hcf  reason: default package */
/* loaded from: classes.dex */
public final class hcf implements hej {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hcf(hbs hbsVar, int i) {
        this.b = i;
        this.a = hbsVar;
    }

    public hcf(hci hciVar, int i) {
        this.b = i;
        this.a = hciVar;
    }

    public hcf(hen henVar, int i) {
        this.b = i;
        this.a = henVar;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b != 0) {
            return false;
        }
        ((hci) this.a).B.w(view, motionEvent);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [hdi, hdj] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            hxk.a(view.getContext()).b(view, 0);
            if (view instanceof EmojiView) {
                ((hci) this.a).B.t(((EmojiView) view).c);
            } else {
                ((ltd) ((ltd) hci.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$2", "onClick", 342, "EmojiPickerController.java")).w("Clicked view is not EmojiView: %s", view);
            }
        } else if (i != 1) {
            if (view instanceof EmojiView) {
                hxk.a(view.getContext()).b(view, 0);
                ((hen) this.a).c.l(((EmojiView) view).c);
                return;
            }
            ((ltd) ((ltd) hen.a.c()).k("com/google/android/libraries/inputmethod/emoji/widget/EmojiListHolderController$1", "onClick", 68, "EmojiListHolderController.java")).w("Clicked view is not EmojiView: %s", view);
        } else if (view instanceof EmojiView) {
            hxk.a(view.getContext()).b(view, 0);
            EmojiView emojiView = (EmojiView) view;
            hyq.o(((hbs) this.a).h, icu.n(emojiView.c.b));
            ((hbs) this.a).f.t(emojiView.c);
        } else {
            ((ltd) ((ltd) hbs.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$2", "onClick", 74, "EmojiListController.java")).w("Clicked view is not EmojiView: %s", view);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                if (!(view instanceof EmojiView)) {
                    ((ltd) ((ltd) hbs.a.c()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$2", "onLongClick", 96, "EmojiListController.java")).w("Long Clicked view is not EmojiView: %s", view);
                } else {
                    EmojiView emojiView = (EmojiView) view;
                    String[] strArr = emojiView.b;
                    if (strArr != null && strArr.length > 0) {
                        Object obj = this.a;
                        if (emojiView.getParent() != null) {
                            hbs hbsVar = (hbs) obj;
                            float width = hbsVar.e.getLayoutParams().width > 0 ? hbsVar.e.getWidth() / hbsVar.e.getLayoutParams().width : 1.0f;
                            gqa.a(hbsVar.b).j(R.string.f159360_resource_name_obfuscated_res_0x7f1405d1);
                            hbsVar.d.b();
                            int[] iArr = new int[2];
                            RecyclerView recyclerView = hbsVar.e;
                            if (recyclerView != null) {
                                recyclerView.getLocationInWindow(iArr);
                                iArr[1] = iArr[0] + hbsVar.e.getWidth();
                            } else {
                                iArr[0] = 0;
                                iArr[1] = hbsVar.b.getResources().getDisplayMetrics().widthPixels;
                            }
                            hbsVar.d.c(emojiView, (View) emojiView.getParent(), strArr, new dww(hbsVar, 3), width, emojiView.getWidth(), emojiView.getHeight(), iArr[0], iArr[1], emojiView.c);
                        }
                        ((hbs) this.a).f.A(view);
                        return true;
                    }
                }
                return false;
            }
            if (!(view instanceof EmojiView)) {
                ((ltd) ((ltd) hen.a.c()).k("com/google/android/libraries/inputmethod/emoji/widget/EmojiListHolderController$1", "onLongClick", 93, "EmojiListHolderController.java")).w("Clicked view is not EmojiView: %s", view);
            } else {
                EmojiView emojiView2 = (EmojiView) view;
                hei heiVar = emojiView2.c;
                llp llpVar = heiVar.f;
                if (((lrl) llpVar).c > 1 && !heiVar.g) {
                    Object obj2 = this.a;
                    String[] strArr2 = (String[]) llpVar.toArray(new String[0]);
                    hen henVar = (hen) obj2;
                    View view2 = henVar.e;
                    float width2 = (view2 != null && view2.getLayoutParams().width > 0) ? henVar.e.getWidth() / henVar.e.getLayoutParams().width : 1.0f;
                    henVar.b();
                    henVar.b.b();
                    int[] iArr2 = new int[2];
                    View view3 = henVar.e;
                    if (view3 != null) {
                        view3.getLocationInWindow(iArr2);
                        iArr2[1] = iArr2[0] + henVar.e.getWidth();
                    } else {
                        iArr2[0] = 0;
                        iArr2[1] = henVar.d.getResources().getDisplayMetrics().widthPixels;
                    }
                    int i2 = henVar.g;
                    if (i2 <= 0) {
                        i2 = emojiView2.getWidth();
                    }
                    int i3 = i2;
                    int i4 = henVar.h;
                    if (i4 <= 0) {
                        i4 = emojiView2.getHeight();
                    }
                    int i5 = i4;
                    if (emojiView2.getParent() != null) {
                        henVar.b.c(emojiView2, (View) emojiView2.getParent(), strArr2, new dww(henVar, 5), width2, i3, i5, iArr2[0], iArr2[1], emojiView2.c);
                    }
                    ((hen) this.a).c.A();
                    return true;
                }
            }
            return false;
        }
        return ((hci) this.a).B.A(view);
    }
}
