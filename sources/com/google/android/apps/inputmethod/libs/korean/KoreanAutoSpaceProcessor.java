package com.google.android.apps.inputmethod.libs.korean;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KoreanAutoSpaceProcessor extends AbstractAutoSpaceProcessor {
    private boolean a;

    private static boolean j(char c) {
        return dmf.b(c) != 0;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor, defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        this.a = iavVar.q.d(R.id.f54750_resource_name_obfuscated_res_0x7f0b01c3, true);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    protected final boolean b(int i) {
        return (this.a && j((char) i)) || ".,;:!?)\\]}]".contains(String.valueOf(Character.toChars(i)));
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    protected final boolean d(int i) {
        return this.a && j((char) i);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    protected final boolean e() {
        return this.a;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.AbstractAutoSpaceProcessor
    protected final boolean g() {
        return this.a;
    }
}
