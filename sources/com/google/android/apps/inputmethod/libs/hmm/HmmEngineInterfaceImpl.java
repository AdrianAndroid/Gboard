package com.google.android.apps.inputmethod.libs.hmm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HmmEngineInterfaceImpl implements AutoCloseable {
    public final long a;

    public HmmEngineInterfaceImpl(long j) {
        this.a = j;
    }

    private native int nativeAppend(long j, ScoredInput[] scoredInputArr, int i);

    private native Range nativeBulkInputTouchData(long j, byte[] bArr, Range range);

    private native Range nativeBulkInputWithHandwritingLatticeNativePointer(long j, long j2, Range range, int[] iArr);

    private native void nativeClose(long j);

    private native boolean nativeDelete(long j, Range range);

    private native String nativeDumpSourceTokenSequenceVectorPointer(long j, long j2);

    private native int nativeGetCandidateCount(long j);

    private native String nativeGetCandidateString(long j, int i);

    private native long nativeGetCandidateToken(long j, int i, int i2);

    private native int nativeGetCandidateTokenCount(long j, int i);

    private native int nativeGetCandidateTokenFeatureCount(long j, int i, int i2);

    private native int nativeGetCandidateType(long j, int i);

    private native Range nativeGetConvertedSegmentsRange(long j);

    private native Range nativeGetDecodingRange(long j);

    private native int nativeGetHighlightedCandidate(long j);

    private native Range nativeGetInputUnitRange(long j, long j2);

    private native String nativeGetInputUnitString(long j, long j2);

    private native long nativeGetSegment(long j, int i);

    private native int nativeGetSegmentCount(long j);

    private native Range nativeGetSegmentRange(long j, long j2);

    private native long nativeGetSegmentToken(long j, long j2, int i);

    private native int nativeGetSegmentTokenCount(long j, long j2);

    private native int nativeGetSeparator(long j, int i);

    private native int nativeGetTokenCandidateCount(long j);

    private native int nativeGetTokenCategory(long j, long j2);

    private native int nativeGetTokenInputType(long j, long j2);

    private native long nativeGetTokenInputUnit(long j, long j2, int i);

    private native int nativeGetTokenInputUnitCount(long j, long j2);

    private native int nativeGetTokenLanguage(long j, long j2);

    private native String nativeGetTokenNormalizedString(long j, long j2);

    private native Range nativeGetTokenRange(long j, long j2);

    private native String nativeGetTokenString(long j, long j2);

    private native boolean nativeIsCandidateDuplicated(long j, int i);

    private native boolean nativeIsSegmentConverted(long j, long j2);

    private native boolean nativeIsSegmentConvertible(long j, long j2);

    private native boolean nativeIsTokenConfident(long j, long j2);

    private native boolean nativeIsTokenSelected(long j, long j2);

    private native void nativeResetUserId(long j, String str);

    private native boolean nativeSetKeyboardLayout(long j, byte[] bArr);

    private native boolean nativeSetSeparator(long j, int i, int i2);

    public final boolean A(long j) {
        return nativeIsTokenSelected(this.a, j);
    }

    public final boolean B(int i, djo djoVar) {
        return nativeSetSeparator(this.a, i, djoVar.ordinal());
    }

    public final int C(int i) {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}[nativeGetCandidateType(this.a, i)];
    }

    public final void D(Range range) {
        nativeDelete(this.a, range);
    }

    public final int E(int i, int i2) {
        return nativeGetCandidateTokenFeatureCount(this.a, i - 1, i2);
    }

    public final int a(ScoredInput[] scoredInputArr, djj djjVar) {
        return nativeAppend(this.a, scoredInputArr, djjVar.ordinal());
    }

    public final int b() {
        return nativeGetCandidateCount(this.a);
    }

    public final int c(int i) {
        return nativeGetCandidateTokenCount(this.a, i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.a);
    }

    public final int d() {
        return nativeGetHighlightedCandidate(this.a);
    }

    public final int e() {
        return nativeGetSegmentCount(this.a);
    }

    public final int f(long j) {
        return nativeGetSegmentTokenCount(this.a, j);
    }

    public final int g() {
        return nativeGetTokenCandidateCount(this.a);
    }

    public final int h(long j) {
        return nativeGetTokenInputUnitCount(this.a, j);
    }

    public final int i(long j) {
        return nativeGetTokenLanguage(this.a, j);
    }

    public final long j(int i, int i2) {
        return nativeGetCandidateToken(this.a, i, i2);
    }

    public final long k(int i) {
        return nativeGetSegment(this.a, i);
    }

    public final long l(long j, int i) {
        return nativeGetSegmentToken(this.a, j, i);
    }

    public final long m(long j, int i) {
        return nativeGetTokenInputUnit(this.a, j, i);
    }

    public final djj n(long j) {
        return djj.values()[nativeGetTokenInputType(this.a, j)];
    }

    public native int nativeAddInputEdge(long j, int i, int i2, ScoredInput scoredInput, int i3);

    public native Range nativeBulkInputWithNativePointer(long j, long j2, Range range);

    public native Range nativeBulkInputWithTargetWords(long j, ScoredInput[] scoredInputArr, Range range);

    public native boolean nativeDeleteCandidate(long j, int i);

    public native boolean nativeFillCandidateList(long j, Range range);

    public native boolean nativeFillPredictionCandidateList(long j);

    public native boolean nativeFillTokenCandidateList(long j, Range range);

    public native int nativeGetCandidateDataSourceMask(long j, int i);

    public native int nativeGetCandidatePrimaryDataSource(long j, int i);

    public native Range nativeGetCandidateRange(long j, int i);

    public native int nativeGetDataSourceIndex(long j, String str);

    public native String nativeGetInputUnitConfidentString(long j, long j2);

    public native int nativeGetPredictionCandidateContextLength(long j, int i);

    public native int nativeGetPredictionCandidateContextWordCount(long j, int i);

    public native int nativeGetPredictionCandidateCount(long j);

    public native int nativeGetPredictionCandidateDataSourceMask(long j, int i);

    public native String nativeGetPredictionCandidateString(long j, int i);

    public native String nativeGetSegmentConvertedString(long j, long j2);

    public native Range nativeGetTokenCandidateRange(long j, int i);

    public native String nativeGetTokenCandidateString(long j, int i);

    public native String nativeGetTokenConfidentString(long j, long j2);

    public native boolean nativeHighlightCandidate(long j, int i);

    public native boolean nativeIsCandidateCorrected(long j, int i);

    public native boolean nativeIsCandidateFromSingleDataSource(long j, int i);

    public native boolean nativeIsInputUnitConfident(long j, long j2);

    public native boolean nativeIsInputUnitEmpty(long j, long j2);

    public native boolean nativeIsSegmentTargeted(long j, long j2);

    public native boolean nativeIsSegmentTokenFullyMatched(long j, long j2);

    public native void nativeRefreshData(long j);

    public native void nativeReset(long j);

    public native boolean nativeSelectCandidate(long j, int i);

    public native boolean nativeSelectRange(long j, Range range);

    public native boolean nativeSelectTokenCandidate(long j, int i);

    public native int nativeSelectTokens(long j, long[] jArr);

    public native boolean nativeUnconvertSegments(long j, Range range);

    public native boolean nativeUnselectTokens(long j, Range range);

    public final Range o() {
        return nativeGetDecodingRange(this.a);
    }

    public final Range p(long j) {
        return nativeGetInputUnitRange(this.a, j);
    }

    public final Range q(long j) {
        return nativeGetSegmentRange(this.a, j);
    }

    public final Range r(long j) {
        return nativeGetTokenRange(this.a, j);
    }

    public final djo s(int i) {
        return djo.values()[nativeGetSeparator(this.a, i)];
    }

    public final String t(int i) {
        return nativeGetCandidateString(this.a, i);
    }

    public final String u(long j) {
        return nativeGetInputUnitString(this.a, j);
    }

    public final String v(long j) {
        return nativeGetTokenNormalizedString(this.a, j);
    }

    public final String w(long j) {
        return nativeGetTokenString(this.a, j);
    }

    public final boolean x(long j) {
        return nativeIsSegmentConverted(this.a, j);
    }

    public final boolean y(long j) {
        return nativeIsSegmentConvertible(this.a, j);
    }

    public final boolean z(long j) {
        return nativeIsTokenConfident(this.a, j);
    }
}
